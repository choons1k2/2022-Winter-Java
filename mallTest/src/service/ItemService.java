package service;

import dao.ItemDao;

public class ItemService {

    private ItemDao itemDao;
    private CartService cartService;

    private ItemService(){};
    private static ItemService instance = new ItemService();
    public static ItemService getInstance(){
        return instance;
    }

    public static ItemService getInstance(ItemDao itemdao){
        instance.itemDao = itemdao;
        instance.cartService = CartService.getInstance();

        return instance;
    }

}
