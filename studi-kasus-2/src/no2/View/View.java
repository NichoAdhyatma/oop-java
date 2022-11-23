package no2.View;

import java.util.Scanner;

public interface View {
    public Scanner input = new Scanner(System.in);
    public void inputShape();
    public void showVolume();
}