/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopBnmSorum;

/**
 *
 * @author zeynep
 */
public class IbadetYapilari extends TarihiYapilar{
    public IbadetYapilari(String adi, int yapimTarihi, String eserMimari) {
        super(adi, yapimTarihi, eserMimari);
        String[] yapi = getClass().getName().toString().split("\\.");
        System.out.println(yapi[1]);
    }

}