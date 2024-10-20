/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator;
import javax.swing.JFrame;
import javax.swing.UIManager;
/**
 *
 * @author User
 */
public class Kalkulator {
    public long operan1;
    public long operan2;
    
    public enum jenisOperasi {
        TIDAK_ADA, TAMBAH, KURANG, KALI, BAGI
    }
    
    jenisOperasi operasiSaatini;
    
    public Kalkulator(){
        operan1 = operan2 = 0;
        operasiSaatini= jenisOperasi.TIDAK_ADA;
        
    }
    
    public void reset(){
        operan1 = operan2 = 0;
        operasiSaatini = jenisOperasi.TIDAK_ADA;
    }
    
    public void penambahan( long op){
        if(operasiSaatini != jenisOperasi.TAMBAH){
            operasiSaatini = jenisOperasi.TAMBAH;
            operan1 = op;
        }
        else {
            operan2 = op;
        }
    }
    public void pengurangan( long op){
        if(operasiSaatini != jenisOperasi.KURANG){
            operasiSaatini = jenisOperasi.KURANG;
            operan1 = op;
        }
        else {
            operan2 = op;
        }
    }
    public void perkalian( long op){
        if(operasiSaatini != jenisOperasi.KALI){
            operasiSaatini = jenisOperasi.KALI;
            operan1 = op;
        }
        else {
            operan2 = op;
        }
    }
    public void pembagian( long op){
        if(operasiSaatini != jenisOperasi.BAGI){
            operasiSaatini = jenisOperasi.BAGI;
            operan1 = op;
        }
        else {
            operan2 = op;
        }
    }
    
    public long eksekusiOperasi (long op) {
        long hasil = 0;
        operan2 = op;
        switch(operasiSaatini){
            case TAMBAH:
                hasil = operan1 + operan2;
                break;
            case KURANG:
                hasil = operan1 - operan2;
                break;
            case KALI:
                hasil = operan1 * operan2;
                break;
            case BAGI:
                hasil = operan1 / operan2;
                break;
            case TIDAK_ADA:
                break;
            default:
                break;
        }
        reset();
        return hasil;
    }
    public static void main(String[] args){
        try{
        UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName()
        );
        }catch(Exception e){
            System.err.println("Gagal Mengganti Look and Feel");
        }
        KFrame frame = new KFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
