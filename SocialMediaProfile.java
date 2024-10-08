class profileDetails {

    String username;
    int age;
    String bio;

    public void createProfile(String username, int age, String bio){

        if(username.isEmpty()){
                throw new IllegalArgumentException("Username cannot be empty");
        }

        if(age < 13 || age > 120){
            throw new IllegalArgumentException("The age must be between 13 and 120");
        }

        if(bio.length() > 160){
            throw new IndexOutOfBoundsException("You have exceeded 160 character");
        }

        System.out.println("Username : " + username);
        System.out.println("Age : " + age);
        System.out.println("Bio : " + bio);

    }

}

public class SocialMediaProfile{

    public static void main(String[] args) {

        profileDetails pd = new profileDetails();

        System.out.println("---This is my profile page---");
        try{
            pd.createProfile("" , 24 , "I am Computer Science Student");
        
        }catch(IllegalArgumentException e){
            System.out.println("Caught bad : " + e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Caught bad : " + e.getMessage());
        }

    }

}

