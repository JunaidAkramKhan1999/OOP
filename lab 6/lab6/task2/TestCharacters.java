public class TestCharacters{
    public static void main(String[] args){
        CommanderSafeguard commanderSafeguard = new CommanderSafeguard("Commander Safeguard");
        System.out.println(commanderSafeguard);
        commanderSafeguard.move();
        commanderSafeguard.speak();
        commanderSafeguard.Powers();


        Doctor DrZibago =new Doctor("DrZibago");
        System.out.println(DrZibago);
        DrZibago.speak();
        DrZibago.move();
        DrZibago.CallSafeguard();

        Children SpecialChiren1 =new Children("Junaid ");
        System.out.println(SpecialChiren1);
        SpecialChiren1.speak();
        SpecialChiren1.move();
        SpecialChiren1.useSafeguardSoap();
        SpecialChiren1.specialPowers();


        Ghunsunna ghunsunna=new Ghunsunna("ghunsunna");
        System.out.println(ghunsunna);
        ghunsunna.speak();
        ghunsunna.move();
        ghunsunna.spreadDisease();

        Dirtoo dirtoo=new Dirtoo("Dirtoo");
        System.out.println(dirtoo);
        dirtoo.speak();
        dirtoo.move();
        dirtoo.spreadDisease();
        dirtoo.specialpowers();

        KachraRani kachrarani=new KachraRani("kachra Rani");
        System.out.println(kachrarani);
        kachrarani.speak();
        kachrarani.move();
        kachrarani.spreadDisease();

        Dirty Dirty =new Dirty("Dirty");
        System.out.println(Dirty);
        Dirty.speak();
        Dirty.move();
        Dirty.spreadDisease();



        Algham  algham =new Algham("Algum");
        System.out.println(algham);
        algham.speak();
        algham.move();
        algham.spreadDisease();

        Paleeda paleeda=new Paleeda("paleeda");
        System.out.println(paleeda);
        paleeda.speak();
        paleeda.move();
        paleeda.spreadDisease();

    }

}