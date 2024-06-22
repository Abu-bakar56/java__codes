//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import java.util.LinkedList;
//class Person{
//    public String name,address;
//    public long ph_no;
//}
//class AddressBook{
//    LinkedList<Person> l = new LinkedList<>();
//    void addPerson(){
//        boolean same_name = false;
//        Person obj = new Person();
//        JTextField f1 = new JTextField();
//        JTextField f2 = new JTextField();
//        JTextField f3 = new JTextField();
//        Object[] fields = {
//                "Name" , f1,
//                "Address" , f2,
//                "Ph No" , f3,
//        };
//        JOptionPane.showConfirmDialog(null,fields,"Adding Person", JOptionPane.DEFAULT_OPTION);
//        for (Person person : l)
//            if (f1.getText().equalsIgnoreCase(person.name))
//                same_name = true;
//        if (same_name){
//            JOptionPane.showMessageDialog(null,"Person already Registered.","Adding Person",JOptionPane.PLAIN_MESSAGE);
//        }
//        else if (f1.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null,"Person must have a Name","Adding Person",JOptionPane.PLAIN_MESSAGE);
//        }
//        else {
//            try{
//                obj.name = f1.getText();
//                obj.address = f2.getText();
//                if (!(f3.getText().isEmpty())){
//                    obj.ph_no = Long.parseLong(f3.getText());
//                }
//                else{
//                    obj.ph_no = -1;
//                }
//                l.add(obj);
//            }
//            catch (NumberFormatException e){
//                JOptionPane.showMessageDialog(null,"Phone-Number can only contain Numbers","Adding Person",JOptionPane.PLAIN_MESSAGE);
//            }
//        }
//    }
//    void deletePerson(){
//        String name = JOptionPane.showInputDialog(null,"Enter Person's Name","Delete Person",JOptionPane.PLAIN_MESSAGE);
//        boolean count = false;
//        for (Person person : l)
//            if (name.equalsIgnoreCase(person.name)) {
//                l.remove(person);
//                count = true;
//            }
//        if (count){
//            JOptionPane.showMessageDialog(null,"Person Deleted Successfully!","Person Delete",JOptionPane.INFORMATION_MESSAGE);
//        }
//        else {
//            JOptionPane.showMessageDialog(null,"Person Doesn't Found !","Person Delete",JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
//    void searchPerson(){
//        String name = JOptionPane.showInputDialog(null,"Enter Person's Name","Delete Person",JOptionPane.PLAIN_MESSAGE);
//        boolean count = false;
//        for (Person person : l)
//            if (name.equalsIgnoreCase(person.name)) {
//                JOptionPane.showMessageDialog(null,"Name : " + person.name +
//                        "\nAddress : " + person.address +
//                        "\nPh NO : " + person.ph_no,"Person's Data",JOptionPane.PLAIN_MESSAGE);
//                count = true;
//            }
//        if (!count){
//                JOptionPane.showMessageDialog(null,"Person Doesn't Found !","Person Delete",JOptionPane.INFORMATION_MESSAGE);
//
//        }
//    }
//}
//public class a_13_program {
//    static void menu(){
//        AddressBook obj = new AddressBook();
//        String ch ="0";
//        while (true){
//            try{
//                ch = JOptionPane.showInputDialog(null, """
//                        Press 1 for Add
//                        Press 2 for Delete
//                        Press 3 for Search
//                        Press e for exit.""","Menu",JOptionPane.PLAIN_MESSAGE);
//            }
//            catch (NullPointerException e){
//                System.exit(0);
//            }
//            switch (ch){
//                case "1":
//                    obj.addPerson();
//                    break;
//                case "2":
//                    obj.deletePerson();
//                    break;
//                case "3":
//                    obj.searchPerson();
//                    break;
//                case "e":
//                case "E":
//                    int o = JOptionPane.showConfirmDialog(null,"Are you sure!","Menu",JOptionPane.YES_NO_OPTION);
//                    if (o == 0){
//                        System.exit(0);
//                    }
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null,"Enter Valid Option","Menu",JOptionPane.PLAIN_MESSAGE);
//                    break;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        menu();
//    }
//}
