package tech.myic.jwhois.util;

public class AppHelper
{
    private AppHelper()
    {
    }

    public static void print(String[] args, String in)
    {
        if ("?".equals(in) || in.equals("--help")){
            System.out.println("Welcome to jwhois.\n"
                    + "==========================================================\n"
                    + "This command line program allows you to see source details of an email\n"
                    + "you have received either in your inbox or spam.\n"
                    + "You can pass in:\n"
                    + "\t a. an email(.eml) file from your local computer: \n"
                    + "\t    This would be the actual email file\n"
                    + "\t ** the argument will be: ef=<path_to_the_eml_file>\n"
                    + "\t b. an IP address: This is the IP address (IPv4) of \n"
                    + "\t    the email\n"
                    + "\t ** the argument will be: ip=<the_ip_address>\n"
                    + "\t c. the source email or original email. You can google\n"
                    + "\t    to know how to get this :)\n"
                    + "\t ** the argument will be: -te, press enter then paste\n"
                    + "\t    the<email_source> and press Ctrl+D on your keyboard\n"
                    + "==========================================================\n"
                    + "PRE-REQUISITE\n"
                    + "In order to use this program, please make sure you are:\n"
                    + "\t 1. Running a Linux machine,\n"
                    + "\t 2. Have installed the whois command.\n"
                    + "==========================================================\n"
                    + "EXAMPLE ON RUNNING THE PROGRAM\n"
                    + "Eg.1: Running the program with email file:\n"
                    + "\t java -jar jwhois.jar ef=<PATH_TO_EMAIL_FILE>/example.eml\n"
                    + "Eg.2: Running the program with IP address:\n"
                    + "\t java -jar jwhois.jar ip=<IP_ADDRESS>\n"
                    + "Eg.3: Running the program with source email:\n"
                    + "\t java -jar jwhois.jar -te \n"
                    + "Press ENTER after typing the above command, then Paste the source and click CTRL+D.\n"
                    + "\n"
                    + "Enjoy!");
            System.exit(1);
        }else if (args.length > 1){
            System.err.println("Enter only 1 params in order to proceed \n"
                    + "Please type: ? or --help to get help");
            System.exit(1);
        }

    }
}
