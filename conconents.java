public class conconents {
    public static void main(String[] args) {
        String x="paurakh".toLowerCase();
        for (int i = 0; i <x.length() ; i++) {
            char ok=x.charAt(i);

            if (!(ok == 'a' || ok == 'e' || ok=='i' || ok=='o' || ok=='u')){
                System.out.print(ok);
            }
        }
    }
}
