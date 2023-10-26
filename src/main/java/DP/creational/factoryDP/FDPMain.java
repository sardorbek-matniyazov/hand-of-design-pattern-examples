package DP.creational.factoryDP;

import DP.creational.factoryDP.builder.ServiceFactory;
import DP.creational.factoryDP.service.Service;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public class FDPMain {
    public static void main(String[] args) {
        //        Factory pattern in use
        final Service mainService = ServiceFactory.produce("main");
        mainService.serve();

        final Service secondaryService = ServiceFactory.produce("secondary");
        secondaryService.serve();
    }
}
