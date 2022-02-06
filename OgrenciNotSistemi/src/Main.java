public class Main {
    public static void main(String[] args) {
         Teacher t1 = new Teacher("Mahmut","trh" ,"0832");
         Teacher t2 = new Teacher("graham","FZK" ,"00000");
         Teacher t3 = new Teacher("yilmaz","bio" ,"11111");
         //t1.print();

         Course tarih = new Course("Tarih","123","trh");
         tarih.addTeacher(t1);

         Course fizik = new Course("Fizik","102","FZK");
         fizik.addTeacher(t2);

         Course biyo = new Course("biyoloji","101","bio");
         biyo.addTeacher(t3);


        Student st1 = new Student("kemal ","123","4", tarih,fizik,biyo );

        st1.addBulkExamNote(100,78,50);
        st1.isPass();

        Student st2 = new Student("selin","144","4", tarih,fizik,biyo );
        st2.addBulkExamNote(50,30,70);
        st2.addSozluNotu(60,90,45);
        st2.isPass();

    }
}
