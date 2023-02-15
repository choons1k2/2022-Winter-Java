package service;

import dao.CartDao;

public class CartService {

    private CartDao cartDao;

    private MallService mallService;

    private CartService(){};
    private static CartService instance = new CartService();

    public static CartService getInstance(){
        return instance;
    }


}
