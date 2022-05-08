package programmer.zaman.now.data;

/**
 * Final Class
 * if you want to make the class cannot inherit to child you can add keyword 'final' in front of class keyword
 */
class SocialMedia {
    String name;
}

final class Facebook extends SocialMedia {
}

//class FakeFacebook extends Facebook{ // it will be error because the parent class was final
//
//}

class Twitter extends SocialMedia {
    /**
     * Final Method
     * you can make the method cannot be overridden by child class with add final keyword infront of void keyword
     */
    final void login(String username, String password) {

    }
}

class FakeTwitter extends Twitter {
//    void login(String username, String password) { //it will be error because you cannot override the final method
//        //isi method
//    }
}
