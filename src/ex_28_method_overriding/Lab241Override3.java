package ex_28_method_overriding;

public class Lab241Override3
{
    static void main(String[] args) {

        SocialMedia sm = new Instagram();
        sm.uploadPicture();
        SocialMedia s2 = new Facebook();
        s2.uploadPicture();
    }
}

