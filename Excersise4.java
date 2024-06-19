public class Excersise4 {
    public static void main(String[] args) {
        String name = "ASAD MOTA HAI BHUT MOTA HAI";
        name = name.toLowerCase();
        System.out.println(name);

        String text = "ASAD bhut acha bacha hai";
        text = text.replace(" ", "-");
        System.out.println(text);

        String letter = "Dear <|name|> , thanks a lot";
        letter = letter.replace("<|name|>", "Umair");
        System.out.println(letter);

        String asad = "This string contain      multiple spaces";
        System.out.println(asad.indexOf("  "));
        System.out.println(asad.indexOf("           "));

        


    }
}
