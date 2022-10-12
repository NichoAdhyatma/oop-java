package Percobaan3;

class SwitchNameBreak {
    public static void main(String[] args) {
        char firstInitial = 'a';
        System.out.println("Masukkan huruf awal nama anda:");
        try {
            firstInitial = (char) System.in.read();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        switch (firstInitial) {
            case 'a':
                System.out.println("Nama anda pasti Asep!");
                break;
            case 'b':
                System.out.println("Nama anda pasti Brodin!");
                break;
            case 'c':
                System.out.println("Nama anda pasti Cecep!");
                break;
            default:
                System.out.println("Nama anda tidak terkenal!");
        }
    }
}