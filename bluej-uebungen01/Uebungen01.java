
/**
 * Beschreiben Sie hier die Klasse Uebungen01.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Uebungen01
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //private int x;

    /**
     * Konstruktor für Objekte der Klasse Uebungen01
     */
    public Uebungen01()
    {
        // Instanzvariable initialisieren
        //x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Zahl_1   
     * @param  Zahl_2   
     * @return      gibt dir modulo aus
     */
    public int a01modulo(int Zahl_1, int Zahl_2)
    {
        int Ergebnis = Zahl_1 / Zahl_2;
        Ergebnis = Ergebnis * Zahl_2;
        Ergebnis = Zahl_1 - Ergebnis;

        return Ergebnis;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Zahl_1   
     * @param  Zahl_2   
     * @return      es wurde gewechselt
     */
    public void tausch(int Zahl_1,int Zahl_2)
    {

        System.out.println("Das ist Zahl_1: "+ Zahl_2 + "; Das ist Zahl_2: " + Zahl_1);

    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Seitenlänge
     * @param  Hoehe
     * @return      (Beschreibung des Rückgabewertes)
     */
    public double pyramide(int Seitenlänge, int Hoehe)
    {
        double volumen;
        volumen = 1.0/3 * Seitenlänge * Seitenlänge * Hoehe;
        return volumen;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Alter    
     * @return      (Beschreibung des Rückgabewertes)
     */
    public void alter(int Alter)
    {
        if(Alter < 7 && Alter >= 0){
            System.out.println("Für ein paar Erze in Burkina Faso langts");
        }

        if(Alter >= 7 && Alter < 18){
            System.out.println("Naja für den Untersuchungsausschuss auf kakao plantagen bis du alt genug");
        }

        if(Alter > 18){
            System.out.println("Lebensziel: Lythium in Chile farmen");
        }

        if(Alter < 0){
            System.out.println("Höchsten 9 Monate, dann bist du bereit für Kobald, Nickel. Microsoft, Samsung & co warden auf dich!");
        }
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  deine Zahl   (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public void ungerade(int deine_Zahl)
    {
        if(deine_Zahl % 2 == 0){
            System.out.println("jou jou jou Gerade!");
        }
        else{
            System.out.println("jou jou jou ned Ungerade!");
        }
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public int note(double Note)
    {
        int note;
        if(Note <0.75 || Note > 6){
            System.out.println("Nop Nop Nop des jed ned!");
            return -1;
        }
        else {
        Note = Note + 0.5;
        note = (int)Note;
        return note;
    }
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public void Wertetabelle()
    {
        for(double x = -2; x <= 2; x += 0.1){
            double Wert = x * x - 6 * x - 4;
            System.out.println(Wert);
            
        }
        return;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public boolean Schaltjahr(int Jahr)
    {
        Jahr = Jahr % 4;
        
        if(Jahr == 0){
            return true;
        }
        else{
        return false;
    }
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Zahl_1   (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public int Stellenzähler(int Zahl_1)
    {
        int stellen = 0;
        if(Zahl_1<0){
            System.out.println("och komm schon, gib ne positive Zahl an");
            stellen = -1;
        }
        while(Zahl_1>0){
        Zahl_1 = Zahl_1 / 10;
        stellen ++;
        }
        
        return stellen;
    }
     
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Zahl_1   (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public int Zahlendreher(int Zahl)
    {
        int Ergebnis = 0;
        int Addition = 0;
        if(Zahl<0){
            System.out.println("och komm schon, gib ne positive Zahl an");
            Ergebnis = -1;
        }
        while(Zahl>0){
        Addition = Zahl % 10;
        Zahl = Zahl / 10;
        Ergebnis = Ergebnis * 10 + Addition;
        }
        
        return Ergebnis;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Zahl   (Beschreibung des Parameters)
     * @return      (Beschreibung des Rückgabewertes)
     */
    public int Quersumme(int Zahl)
    {
        int quersumme = 0;
        int Addition = 0;
        if(Zahl<0){
            System.out.println("och komm schon, gib ne positive Zahl an");
            quersumme = -1;
        }
        while(Zahl>0){
        Addition = Zahl % 10;
        Zahl = Zahl / 10;
        quersumme = quersumme + Addition;
        }
        
        return quersumme;
    }
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Breite (Beschreibung des Parameters)
     * @return		Das Quadrat
     */
    public void Quadrat(int Breite)
    {
        int BreiteRAM = 0;
        BreiteRAM = Breite;
        int Zeile = Breite - 1;
        while(BreiteRAM > 0){
            System.out.print(" X ");
            BreiteRAM --;
            if(BreiteRAM == 0 && Zeile > 0){
            System.out.println("");
            Zeile --;
            BreiteRAM = Breite;
        }
        }
        return;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  Grundfläche	(Beschreibung des Parameters)
     * @return		Das Dreieck
     */
    public void Dreieck(int Grundfläche)
    {
        int Länge = 1;
        int Durchgänge = 1;
        while(Durchgänge <= Grundfläche){
            while(Länge <= Durchgänge){
                System.out.print("X");
                Länge ++;
            }
        Durchgänge ++;
        System.out.println("");
        Länge = 1;
    }   
    }

}
