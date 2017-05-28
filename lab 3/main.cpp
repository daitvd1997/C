#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
#include<time.h>

int loadData(float &coin) {
    FILE *f = fopen("input.txt", "rt");
    if(f == NULL) {
        printf("Open could not opened please check your file\n");
        return 0;
    }
    fscanf(f,"%f ", &coin);
    fclose(f);
    return 1;
}

int getChoice() {
    int choice = 0;
    char temp;
    int k =1;
    do {
    	fflush(stdin);
        scanf("%d%c",&choice,&temp);
        if(choice <= 3 && choice >= 1 && temp == '\n') {
            k = 0;
        }
        else
            printf("Choice is incorrect! please check again\nYour choice ");
    }while(k);
    return choice;
}

void playGame(float &coin) {
    coin -=0.25;
    printf("The slot machine shows ");
    srand(time(NULL));
    int n1,n2,n3;
    n1 = 1+rand() % 9;
    n2 = rand() %9;
    n3 = rand() % 9;
    printf("%d%d%d\n",n1 ,n2 ,n3);
    if(n1 == n2 && n2 == n3) {
        printf("You win the big prize, $10.00!!\n\n");
        coin += 10;
    } else if(n1 == n2 || n2 == n3 || n3 == n1) {
        printf("You win 50 cents\n\n");
        coin += 0.5;
    } else
        printf("Sorry you don't win anything.\n\n");
}

int saveGame(float coin) {
    FILE *f = fopen("input.txt", "wt");
    if(f == NULL) {
        printf("Open could not opened please check your file\n");
        return 0;
    }
    fprintf(f,"%f ", coin);
    fclose(f);
    printf("Your money had saved!!\n\n");
    return 1; 
}

void cashOut(float coin) {
    printf("Thank you for playing. You end with %f", coin);
}

void menu() {
    printf("Choose one of following menu option:\n");
    printf("1. Play the slot machine\n");
    printf("2. Save game\n");
    printf("3, Cash out\n");
    printf("Your choice: ");
}

int main() {
    float coin =0;
    if(loadData(coin) == 0)
	return 1;
    while(1) {
        printf("You have $%.2f.\n",coin);
        menu();
        int choice = getChoice();
        switch(choice) {
            case 1:
                playGame(coin);
                break;
            case 2:
                saveGame(coin);
                break;
            case 3:
                cashOut(coin);
                return 1;
        }
    }
}
