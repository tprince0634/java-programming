package CryptoGraphy;

public class CaesarCypher {

    //THERE ARE 26 ALPHABET
    private String ALPHABET ="ABCDEFIGHIJKLMNOPQRSTUVWXYZ";

    public  String encrppt(String plainText,int key){
        String cipherText="";

        plainText=plainText.toUpperCase();

        for(int i=0;i<plainText.length();i++){
            char character = plainText.charAt(i);
            //find the numerical representation (index) associated

            int charIndex = ALPHABET.indexOf(character);
            int encryptedindex = (charIndex+key) % ALPHABET.length();
            cipherText += ALPHABET.charAt(encryptedindex);

        }


        return cipherText;
    }

}
