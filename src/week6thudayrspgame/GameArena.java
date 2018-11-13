
package week6thudayrspgame;

class GameArena {


Gamer gamer1;
Gamer gamer2;
static boolean isGameOver;
    
    GameArena(Gamer gamer1, Gamer gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 =gamer2;
    }

    void startGame() {
         while(!isGameOver)
         {
          gamer1.move();
          gamer2.move();
          StatHelper.processMoves(gamer1, gamer2);
          StatHelper.displayMoves(gamer1, gamer2);
         
         }
    }


}
