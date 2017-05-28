#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
#include<time.h>

#define SIZE_STRING 127 //Size of string, you can change if you need larger size
#define String char*
#define CLEAR fpurge(stdin)
#define STRING newString()
#define LIST_STRING(size) newListString(size)

String newString(){ // init string
    String str;
    str = (char*)malloc(SIZE_STRING*sizeof(char));
    return str;
}


String* newListString(int length){  // init a list String
    String* list = (String*)malloc(length*sizeof(String));
    for(int i=0; i<length; i++){
        list[i] = STRING;
    }
    return list;
}

typedef struct TF{
    String question;
    String trueAnswer;
    int mark;
} TrueFalse;

typedef struct MC{
    String question;
    String* listChoices;
    String trueAnswer;
    int lengthListChoice;
    int mark;
} MultipleChoice;

typedef struct SA{
    String question;
    String trueAnswer;
    int mark;
} ShortAnswer;

typedef struct result{
    TrueFalse* listTF;
    MultipleChoice* listMC;
    ShortAnswer* listSA;
    int size;
    int lengthTF;
    int  lengthMC;
    int lengthSA;    
    int indexTF;
    int indexSA;
    int indexMC;
} OBJECT;

int isType(String type){
    if(strcmp(type,"TF")==0){
        return 1;
    }
    if(strcmp(type,"MC")==0){
        return 2;
    }
    if(strcmp(type,"SA")==0){
        return 3;
    }
    return 0;
}

TrueFalse* creListTF(TrueFalse* list, int *size){
    list = (TrueFalse*)realloc(list, (*size+1)*sizeof(TrueFalse));
    *size+=1;
    list[*size-1].question = STRING;
    list[*size-1].trueAnswer = STRING;
    return list;
}

MultipleChoice* creListMC(MultipleChoice* list, int *size){
    list = (MultipleChoice*)realloc(list, (*size+1)*sizeof(MultipleChoice));
    *size+=1;
    list[*size-1].question = STRING;
    list[*size-1].trueAnswer = STRING;
    return list;
}

ShortAnswer* creListSA(ShortAnswer* list, int *size){
    list = (ShortAnswer*)realloc(list, (*size+1)*sizeof(ShortAnswer));
    *size+=1;
    list[*size-1].question = STRING;
    list[*size-1].trueAnswer = STRING;
    return list;
}

OBJECT loadDataFromFile(String fileName, int *status){
    TrueFalse* listTF = NULL;
    MultipleChoice* listMC = NULL;
    ShortAnswer* listSA = NULL;
    
    int size = 0;
    int lengthTF = 0;
    int  lengthMC = 0;
    int lengthSA = 0;
    
    String line = STRING;
    FILE *f = fopen(fileName,"r");
    
    if(f==NULL){
        OBJECT result;
        *status = 0;
        return result;
    }
    
    fgets(line,100,f);
    size = atoi(line);
    
    for(int i=0; i<size; i++){
        fgets(line,3,f);
        int type = isType(line);
        switch(type){
            case 1:
                listTF = creListTF(listTF, &lengthTF);
                fgets(line,100,f);
                listTF[lengthTF-1].mark = atoi(line);
                fgets(listTF[lengthTF-1].question,256,f);
                fgets(listTF[lengthTF-1].trueAnswer,256,f);
                listTF[lengthTF-1].trueAnswer[strlen(listTF[lengthTF-1].trueAnswer)-2] = NULL;
                break;
            case 2                                                                                                                                             :
                listMC = creListMC(listMC,&lengthMC);
                fgets(line,100,f);
                listMC[lengthTF-1].mark = atoi(line);
                fgets(listMC[lengthMC-1].question,256,f);
                int length = 0;
                fgets(line,100,f);
                length = atoi(line);
                listMC[lengthMC-1].lengthListChoice = length;
                String* listAnswers = LIST_STRING(length);
                
                for(int j=0; j<length; j++){
                    fgets(listAnswers[j],256,f);
                    listAnswers[j][strlen(listAnswers)-2] = NULL;
                }
                listMC[lengthMC-1].listChoices = listAnswers;
                fgets(listMC[lengthMC-1].trueAnswer,256,f);
                listMC[lengthMC-1].trueAnswer[strlen(listMC[lengthMC-1].trueAnswer)-2] = NULL;
                break;
            case 3:
                listSA = creListSA(listSA,&lengthSA);
                fgets(line,100,f);
                listSA[lengthTF-1].mark = atoi(line);
                fgets(listSA[lengthSA-1].question,256,f);
                fgets(listSA[lengthSA-1].trueAnswer,256,f);
                listSA[lengthSA-1].trueAnswer[strlen(listSA[lengthSA-1].trueAnswer)-2] = NULL;
                break;
        }
    }
    OBJECT data;
    data.listTF = listTF;
    data.listMC = listMC;
    data.listSA = listSA;
    data.lengthTF = lengthTF;
    data.lengthMC = lengthMC;
    data.lengthSA = lengthSA;
    data.size = size;
    
    *status = 1;
    return data;
}

void showTF(OBJECT data){
    printf("Mark: %d\n",data.listTF[data.indexTF].mark);
    printf("Question: %s\n",data.listTF[data.indexTF].question);
}
void showMC(OBJECT data){
    printf("Mark: %d\n",data.listMC[data.indexMC].mark);
    printf("Question: %s\n",data.listMC[data.indexMC].question);
    for(int i=0; i<data.listMC[data.indexMC].lengthListChoice; i++){
        printf("%c: %s\n",(char)('A' + i), data.listMC[data.indexMC].listChoices[i]);
    }
}
void showSA(OBJECT data){
    printf("Mark: %d\n",data.listSA[data.indexSA].mark);
    printf("Question: %s\n",data.listSA[data.indexSA].question);
}

int nextQuestion(OBJECT data){
    int next = 0;
    do{
        next = rand()%3;
        switch(next){
            case 0: 
                if(data.indexTF + 1 <= data.lengthTF){
                    return 1;
                }
                break;
            case 1:
                if(data.indexMC + 1<=data.lengthMC){
                    return 2;
                }
                break;
            case 2:
                if(data.indexSA + 1<=data.lengthSA){
                    return 3;
                }
                break;
        }
    } while(1);
}
int getSize(int maxSize){
    int number;
    char c;
    int flag = 0;
    do{
        printf("Input size(range: %d): ",maxSize);
        flag = scanf("%d%c",&number,&c);
        fpurge(stdin);
        if(flag != 2){
            printf("Your input is not a number!\n");
            continue;
        }
        if(number<0){
            printf("Negative number is not accept!\n");
            continue;
        }
        if(number>maxSize){
            printf("Too many!\n");
            continue;
        }
        return number;
    } while(1);
}

int getMark(OBJECT data, int type){
    char answer[20] ="";
    printf("Enter your answer: ");
    gets(answer);
    fpurge(stdin);
    
    int compare = strcmp(answer,"SKIP");
    if(!compare){
        switch(type){
            case 1:
                printf("You was skipped!\n");
                printf("True answer: %s\n",data.listTF[data.indexTF].trueAnswer);
                break;
            case 2:
                printf("You was skipped!\n");
                printf("True answer: %s\n",data.listMC[data.indexMC].trueAnswer);
                break;
            case 3:
                printf("You was skipped!\n");
                printf("True answer: %s\n",data.listSA[data.indexSA].trueAnswer);
                break;
        }
        printf("You don't get mark!\n");
        return 0;
    }
    switch(type){
        case 1:
            compare = strcmp(answer,data.listTF[data.indexTF].trueAnswer);
            if(!compare){
                printf("Right!\n");
                printf("You get %d mark!\n",data.listTF[data.indexTF].mark);
                return data.listTF[data.indexTF].mark;
            } else{
                printf("Wrong!\n");
                printf("True answer: %s\n",data.listTF[data.indexTF].trueAnswer);
                printf("You lost %d mark!\n",data.listTF[data.indexTF].mark);
                return -1*data.listTF[data.indexTF].mark;
            }
            break;
        case 2:
            compare = strcmp(answer,data.listMC[data.indexMC].trueAnswer);
            if(!compare){
                printf("Right!\n");
                printf("You get %d mark!\n",data.listMC[data.indexMC].mark);
                return data.listMC[data.indexMC].mark;
            } else{
                printf("Wrong!\n");
                printf("True answer: %s\n",data.listMC[data.indexMC].trueAnswer);
                printf("You lost %d mark!\n",data.listMC[data.indexMC].mark);
                return -1*data.listMC[data.indexMC].mark;
            }
            break;
        case 3:
            compare = strcmp(answer,data.listSA[data.indexSA].trueAnswer);
            if(!compare){
                printf("Right!\n");
                printf("You get %d mark!\n",data.listSA[data.indexSA].mark);
                return data.listSA[data.indexSA].mark;
            } else{
                printf("Wrong!\n");
                printf("True answer: %s\n",data.listSA[data.indexSA].trueAnswer);
                printf("You lost %d mark!\n",data.listSA[data.indexSA].mark);
                return -1*data.listSA[data.indexSA].mark;
            }
            break;
    }
    
    return 0;
}

void solve(){
    OBJECT data;
    String firstName = STRING;
    String lastName = STRING;
    String fileName = STRING;
    int status = 0;
    int numberQuest = 0;
    int mark = 0;
    printf("Enter your first name: ");
    gets(firstName);
    CLEAR;
    printf("Enter your last name: ");
    gets(lastName);
    CLEAR;
    printf("Enter your file name: ");
    gets(fileName);
    CLEAR;
    
    data = loadDataFromFile(fileName,&status);
    data.indexMC = 0;
    data.indexSA = 0;
    data.indexTF = 0;
    
    if(!status){
        printf("File not found!\n");
    } else{
        printf("Data load success!\n");
        
        int typeNext ;
        
        printf("How many question do you want to?: ");
        numberQuest = getSize(data.size);
        
        for(int i=0; i<numberQuest; i++){
            printf("\n\n\t\t** %d **\n\n",i);
            typeNext = nextQuestion(data);
            switch(typeNext){
                case 1:
                    printf("Your mark: %d\n",mark);
                    showTF(data);
                    mark += getMark(data,1);
                    data.indexTF++;
                    break;
                case 2:
                    printf("Your mark: %d\n",mark);
                    showMC(data);
                    mark += getMark(data,2);
                    data.indexMC++;
                    break;
                case 3:
                    printf("Your mark: %d\n",mark);
                    showSA(data);
                    mark += getMark(data,3);
                    data.indexSA++;
                    break;
            }
        }
        printf("\n\n*******************\n\tFINAL MARK\n\t%d",mark);
        data.indexMC = 0;
        data.indexSA = 0;
        data.indexTF = 0;
    }
    
}


int main(int argc, char** argv) {
    solve();
    return (EXIT_SUCCESS);
}