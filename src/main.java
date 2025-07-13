public class main {

        public static void main(String[] args){
            StudentInfo s1 = new StudentInfo("Swastika", 18, 3.5);
            s1.displayInfo();

            s1.setName("Rama");
            s1.setAge(27);
            s1.setGrade(3.5);


            System.out.println("Updated name:"  + s1.getName());
            System.out.println("Updated age:" + s1.getAge() );
            System.out.println("Updated Grade:" + s1.getGrade());
        }
    }


