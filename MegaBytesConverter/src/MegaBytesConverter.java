public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        int megaBytes = kilobytes / 1024;
        int remainingKiloBytes = kilobytes % 1024;

        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.println(kilobytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
