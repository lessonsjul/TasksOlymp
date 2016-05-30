package Клетки_одного_цвета;

import java.io.*;

class Case{
    private int x;
    private int y;
    private boolean isWhite;

    public Case(String[] line) {
        this.x = Integer.valueOf(line[0]);
        this.y = Integer.valueOf(line[1]);
        initColor();
    }

    private void initColor() {
        if(this.x % 2 == 0 && this.y % 2 != 0 ||
                this.x % 2 != 0 && this.y % 2 == 0)
            this.isWhite = true;
        else
            this.isWhite = false;
    }

    public boolean isWhite() {
        return this.isWhite;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            Case[] cases = new Case[6];
            StringBuilder white = new StringBuilder();
            StringBuilder black = new StringBuilder();
            int i = 0;
            while(i < 6){
                Case aCase = new Case(reader.readLine().split(" "));
                if(aCase.isWhite())
                    white.append(aCase).append(" ");
                else
                    black.append(aCase).append(" ");
                i++;
            }

            String result = white.toString().trim();
            writer.write(result);
            result = black.toString().trim();
            writer.newLine();
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
