package ie.tudublin; //prevents namespace conflicts
//gitignore ignores files that you dont want to go into the git repo when you commit 

public class Main
{
    public static void main(String[] args)
    {
        for (int i =0;i <args.length; i++){
            System.out.println(args[i]);
        }

        for(String s:args){
            System.out.println(s);
        }
    }
}
