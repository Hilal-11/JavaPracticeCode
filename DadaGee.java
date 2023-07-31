import javax.print.DocFlavor.STRING;

public class DadaGee {
    String name = "Hilal Ahmad Ganie";
    String sirName = "Hilal";
    int age = 66;

}

class father extends DadaGee {
    String name = "Junaid pir";
    int property = 50;
}

class mother {
    String name = "MOM";
    String sirName = "MOM_1";
    int property = 30;

}

class child extends father {
    String name = "Kaala Teeka";
}
