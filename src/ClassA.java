import java.util.Scanner;
public class ClassA {
    public void method1(){
        String[] Places = new String[] {"ი.ჭავჭავაძის გამზ. ", "ვაჟა-ფშაველას გამზ. ", "გურაბაშვილის გამზ. "};
        Scanner sc = new Scanner(System.in);
        System.out.println("მიმდინარეობს კავშირის დამყარება...\n");
        System.out.println("დასვი კითხვა:\n");
        String input1 = sc.nextLine();
        if (input1.equals("გამარჯობა")){
            System.out.println("პასუხი: მოგესალმებით, რით შემიძლია დაგეხმაროთ?");
        }
        System.out.println("დასვი კითხვა:\n");
        String input2 = sc.nextLine();
        if (input2.equals("მაჩვენე კურსი")){
            System.out.println("პასუხი: 1 დოლარი არის - > 3.30646 ლარი");
        }
        System.out.println("დასვი კითხვა:\n");
        String input3 = sc.nextLine();
        if (input3.equals("მაჩვენე ფილიალები")){
            for (int i = 0; i <= Places.length-1; i++){
                System.out.println(Places[i]);
            }
        }
        System.out.println("დასვი კითხვა:\n");
        String input4 = sc.nextLine();
        if (input4.equals("როგორი ამინდია?")){
            System.out.println("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს.");
        }
        System.out.println("დასვი კითხვა:\n");
        String input5 = sc.nextLine();
        if (input5.equals("ნახვამდის")){
            System.out.println("პასუხი: გმადლობთ რომ დაგვიკავშირდით. ნახვამდის!");
            System.out.println("კავშირის დასასრული!");
        }


    }
}
