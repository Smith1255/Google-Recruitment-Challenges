 public class Answer {   
    public static int[][] answer(int[][] population, int x, int y, int strength) { 
        int colBack, colForward;
        if (population[y][x] <= strength) {
   
            for (int col = x; col >= 0 && population[y][col] <= strength; col--) {
                population[y][col] = -1;
                if (y+1 < population.length && population[y+1][col] <= strength)
                    population[y+1][col] = -1;
                if (y-1 >= 0 && population[y-1][col] <= strength)
                    population[y-1][col] = -1;
            }
            
            for (int col = x+1; col < population[y].length && population[y][col] <= strength; col++) {
                population[y][col] = -1;
                if (y+1 < population.length && population[y+1][col] <= strength)
                    population[y+1][col] = -1;
                if (y-1 >= 0 && population[y-1][col] <= strength)
                    population[y-1][col] = -1;
            }
            
            for (int row = y-1; row >= 0; row--) {
                for (int col = 0; col < population[row].length; col++){
                    if (population[row][col] == -1) {
                        colBack = 1;
                        colForward = 1;
                        while (col-colBack >= 0 && (population[row][col-colBack] <= strength)) {
                            population[row][col-colBack] = -1;
                            if (row+1 < population.length && population[row+1][col-colBack] <= strength)
                                population[row+1][col-colBack] = -1;
                            if (row-1 >= 0 && population[row-1][col-colBack] <= strength)
                                population[row-1][col-colBack] = -1;
                            colBack++;
                        }
                        while (col+colForward < population[row].length && (population[row][col+colForward] <= strength)) {
                            population[row][col+colForward] = -1;
                            if (row+1 < population.length && population[row+1][col+colForward] <= strength)
                                population[row+1][col+colForward] = -1;
                            if (row-1 >= 0 && population[row-1][col+colForward] <= strength)
                                population[row-1][col+colForward] = -1;
                            colForward++;
                        }
                    }
                }
            }
            for (int row = y; row < population.length; row++) {
                System.out.print (row + " " + y);
                for (int col = 0; col < population[row].length; col++){
                    if (population[row][col] == -1) {
                        colBack = 1;
                        colForward = 1;
                        while (col-colBack >= 0 && (population[row][col-colBack] <= strength)) {
                            population[row][col-colBack] = -1;
                            if (row+1 < population.length && population[row+1][col-colBack] <= strength)
                                population[row+1][col-colBack] = -1;
                            if (row-1 >= 0 && population[row-1][col-colBack] <= strength)
                                population[row-1][col-colBack] = -1;
                            colBack++;
                        }
                        while (col+colForward < population[row].length && (population[row][col+colForward] <= strength)) {
                            population[row][col+colForward] = -1;
                            if (row+1 < population.length && population[row+1][col+colForward] <= strength)
                                population[row+1][col+colForward] = -1;
                            if (row-1 >= 0 && population[row-1][col+colForward] <= strength)
                                population[row-1][col+colForward] = -1;
                            colForward++;
                        }
                    }
                }
            }
            
        }
        for (int row = 0; row < population.length; row++) {
            for (int col = 0; col < population[row].length; col++) {
                System.out.print (population[row][col] + " ");
            }
            System.out.println();
        }
        return population;
    
        } 
    }