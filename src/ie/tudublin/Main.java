package ie.tudublin; //prevents namespace conflicts
//gitignore ignores files that you dont want to go into the git repo when you commit 
//git add . adds all files to staging area before you make a commit
public class Main
{

    //changes on the test branch
    
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
