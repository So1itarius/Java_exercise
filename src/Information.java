import java.util.ArrayList;

class Information  {
    ArrayList<Reader> readers;
    Object book;
    ArrayList<Information> Group_book;


    Information(Object b, ArrayList<Reader> r){
        readers=r;
        book=b;
    }
    void addGroup(ArrayList<Information> e){
        Group_book=e;
    }



    //public static void addGroup(Information i){
    //    Group.add(i);
    //}



}

