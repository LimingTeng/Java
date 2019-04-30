package InnerClasses;

import java.util.Scanner;

/**
 * Created by LynnTeng on 2019/4/30.
 */
public class GearboxMain {
    public static Scanner scanner = new Scanner(System.in);
    public static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

            btnPrint.setOnClickListener(new

            ClickListener());

            listen();
        }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

