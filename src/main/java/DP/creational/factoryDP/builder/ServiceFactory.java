package DP.creational.factoryDP.builder;

import DP.creational.factoryDP.exception.WrongTypeException;
import DP.creational.factoryDP.service.MainService;
import DP.creational.factoryDP.service.SecondaryService;
import DP.creational.factoryDP.service.Service;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public class ServiceFactory {
//    there are maybe some required fields
    private static ServiceFactory INSTANCE;
    private ServiceFactory() {}

    private static ServiceFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ServiceFactory();
        }
        return INSTANCE;
    }

    private Service produceReal(String type) {
        if (Service.ServiceTypes.MAIN.equals(type)) {
            return new MainService();
        } else if (Service.ServiceTypes.SECONDARY.equals(type)) {
            return new SecondaryService();
        }
        throw new WrongTypeException(String.format("There are no such service which name like %s", type));
    }

    public static Service produce(String type) {
        return ServiceFactory.getInstance().produceReal(type);
    }

}
