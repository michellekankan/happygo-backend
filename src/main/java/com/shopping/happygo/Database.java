package com.shopping.happygo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
	private static ArrayList<Product> products = new ArrayList<>();
	private static Map<String, Cart> carts = new HashMap<>();
	private static ArrayList<Order> orders = new ArrayList<>();
	
	public static List<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setUserName("michelle");
		user1.setPassword("123");
		users.add(user1);
		return users;
	}
	
	public static boolean isUserExisted(String userName) {
		for(User user : getUsers()) {
			if(user.getUserName().equals(userName)) {
				return true;
			}
		}
		return false;
	}
	
	public static List<UserProfile> getUsersProfiles() {
		ArrayList<UserProfile> usersProfiles = new ArrayList<>();
		UserProfile userProfile1 = new UserProfile();
		userProfile1.setUserName("michelle");
		userProfile1.setAge(31);
		userProfile1.setEmail("michellekan0102@gmail.com");
		userProfile1.setPhoneNumber("12345561");
		userProfile1.setAddress("3175 Bowers Ave, Santa Clara, CA 95054");
		userProfile1.setPreferredCategory("Home, Kitchen & Garden");
		usersProfiles.add(userProfile1);
		return usersProfiles;
	}
	
	
	public static UserProfile getUserProfileByUsername(String username) {
	    for (UserProfile userProfile : getUsersProfiles()) {
	        if (userProfile.getUserName().equals(username)) {
	            return userProfile;
	        }
	    }
	    return null; // Or throw an exception if you prefer
	}
	
	public static String getUserAddressByUsername(String username) {
		for (UserProfile userProfile : getUsersProfiles()) {
	        if (userProfile.getUserName().equals(username)) {
	            return userProfile.getAddress();
	        }
	    }
	    return null; // Or throw an exception if you prefer
		
	}
	
	private static void initializeProducts() {
		Product product1 = new Product();
		product1.setImage("image/product/mirror.jpeg");
		product1.setProductName("Mirror");
		product1.setPrice(60.00);
		product1.setCategory("Home, Kitchen & Garden");
		product1.setDescription("Metal mounting brackets and hanging hardware included.");
		products.add(product1);
		Product product2 = new Product();
		product2.setImage("image/product/bottle.png");
		product2.setProductName("Bottle");
		product2.setPrice(20.00);
		product2.setCategory("Home, Kitchen & Garden");
		product2.setDescription("Manufactured in a way similar to handmade glasses, which means that the stem of the glass is smooth and has no seam.");
		products.add(product2);
		Product product3 = new Product();
		product3.setImage("image/product/flowerBox.jpg");
		product3.setProductName("Flower Box");
		product3.setPrice(22.99);
		product3.setCategory("Home, Kitchen & Garden");
		product3.setDescription("Made of acacia, which is a hard and durable material suitable for outdoor use.");
		products.add(product3);
		Product product4 = new Product();
		product4.setImage("image/product/utensils.jpg");
		product4.setProductName("Utensils");
		product4.setPrice(32.99);
		product4.setCategory("Home, Kitchen & Garden");
		product4.setDescription("Durable, balanced, and easy to clean, since it is made of a single piece of stainless steel.");
		products.add(product4);
		Product product5 = new Product();
		product5.setImage("image/product/couch.jpg");
		product5.setProductName("Couch");
		product5.setPrice(699.20);
		product5.setCategory("Home, Kitchen & Garden");
		product5.setDescription("It’s a durable material with a smooth weave and a nice two-tone effect.");
		products.add(product5);
		Product product6 = new Product();
		product6.setImage("image/product/macbook.jpg");
		product6.setProductName("Macbook");
		product6.setPrice(1990.00);
		product6.setCategory("Electronics & Computers");
		product6.setDescription("14-inch Liquid Retina XDR display.");
		products.add(product6);
		Product product7 = new Product();
		product7.setImage("image/product/iphone.jpg");
		product7.setProductName("iPhone");
		product7.setPrice(829.00);
		product7.setCategory("Electronics & Computers");
		product7.setDescription("The 48MP Main camera is more advanced than ever, capturing super‑high‑resolution photos with a new level of detail and color.");
		products.add(product7);
		Product product8 = new Product();
		product8.setImage("image/product/camera.jpg");
		product8.setProductName("Camera");
		product8.setPrice(999.00);
		product8.setCategory("Electronics & Computers");
		product8.setDescription("Advanced Video and Imaging Controls.");
		products.add(product8);
		Product product9 = new Product();
		product9.setImage("image/product/tv.jpg");
		product9.setProductName("TV");
		product9.setPrice(120.90);
		product9.setCategory("Electronics & Computers");
		product9.setDescription("Unified remote control.");
		products.add(product9);
		Product product10 = new Product();
		product10.setImage("image/product/microwave.jpg");
		product10.setProductName("Microwave Oven");
		product10.setPrice(115.99);
		product10.setCategory("Electronics & Computers");
		product10.setDescription("approved with advanced safety technology for long-lasting durability and a 1-year assurance provided by Chefman. ");
		products.add(product10);
		Product product11 = new Product();
		product11.setImage("image/product/top.jpg");
		product11.setProductName("Top");
		product11.setPrice(21.41);
		product11.setCategory("Clothes, Shoes & Accessories");
		product11.setDescription("Material Lightweight,ultra soft could keep you warm all day but stay cool.");
		products.add(product11);
		Product product12 = new Product();
		product12.setImage("image/product/shirt.jpg");
		product12.setProductName("Jean Shirt");
		product12.setPrice(30.41);
		product12.setCategory("Clothes, Shoes & Accessories");
		product12.setDescription("Relaxed fit.");
		products.add(product12);
		Product product13 = new Product();
		product13.setImage("image/product/shoes.jpg");
		product13.setProductName("High Heels");
		product13.setPrice(33.99);
		product13.setCategory("Clothes, Shoes & Accessories");
		product13.setDescription("Heel High 4.5 Inch with 0.15 Inch Platform.");
		products.add(product13);
		Product product14 = new Product();
		product14.setImage("image/product/jeans.jpg");
		product14.setProductName("Jeans");
		product14.setPrice(22.98);
		product14.setCategory("Clothes, Shoes & Accessories");
		product14.setDescription("It's made of a breathable cotton blend with just the right amount of stretch and features a slim fit for more of a sleek, streamlined look.");
		products.add(product14);
		Product product15 = new Product();
		product15.setImage("image/product/pearls.jpg");
		product15.setProductName("Pearl Necklace");
		product15.setPrice(60.99);
		product15.setCategory("Clothes, Shoes & Accessories");
		product15.setDescription("Our jewelry is a surprise and a great gift for parties, birthdays, anniversaries, mother's days or weddings");
		products.add(product15);
		Product product16 = new Product();
		product16.setImage("image/product/cream.jpg");
		product16.setProductName("Moisturizer Lotion");
		product16.setPrice(7.85);
		product16.setCategory("Beauty & Health");
		product16.setDescription("Daily body lotion is a key part of a skincare routine.");
		products.add(product16);
		Product product17 = new Product();
		product17.setImage("image/product/perfume.jpg");
		product17.setProductName("Perfume");
		product17.setPrice(40.99);
		product17.setCategory("Beauty & Health");
		product17.setDescription("Vegan | Cruelty-free | Clean ingredients.");
		products.add(product17);
		Product product18 = new Product();
		product18.setImage("image/product/mask.jpg");
		product18.setProductName("Mask");
		product18.setPrice(5.29);
		product18.setCategory("Beauty & Health");
		product18.setDescription("This is a non-medical mask and is not approved for protection against COVID-19.");
		products.add(product18);
		Product product19 = new Product();
		product19.setImage("image/product/sunscreen.jpg");
		product19.setProductName("Sunscreen");
		product19.setPrice(9.58);
		product19.setCategory("Beauty & Health");
		product19.setDescription("Superior sun protection in a lightweight formula from #1 dermatologist-recommended suncare brand");
		products.add(product19);
		Product product20 = new Product();
		product20.setImage("image/product/lipstick.jpg");
		product20.setProductName("Lipstick");
		product20.setPrice(6.48);
		product20.setCategory("Beauty & Health");
		product20.setDescription("Super-moisturizing, comfortable feel.");
		products.add(product20);
		Product product21 = new Product();
		product21.setImage("image/product/basketball.jpg");
		product21.setProductName("Baseketball");
		product21.setPrice(12.97);
		product21.setCategory("Sports & Outdoors");
		product21.setDescription("Inflation retention lining creates longer lasting air retention.");
		products.add(product21);
		Product product22 = new Product();
		product22.setImage("image/product/bike.jpg");
		product22.setProductName("Bike");
		product22.setPrice(98.00);
		product22.setCategory("Sports & Outdoors");
		product22.setDescription("includes an alloy quick-release seat binder for easy adjustments to the right height, or to simply remove when needed.");
		products.add(product22);
		Product product23 = new Product();
		product23.setImage("image/product/campingChair.jpg");
		product23.setProductName("Camping Chair");
		product23.setPrice(45.99);
		product23.setCategory("Sports & Outdoors");
		product23.setDescription("The portable design is ideal for outdoor activities and is equally suitable for indoor use.");
		products.add(product23);
		Product product24 = new Product();
		product24.setImage("image/product/tennisRacket.jpg");
		product24.setProductName("Tennis Racket");
		product24.setPrice(19.97);
		product24.setCategory("Sports & Outdoors");
		product24.setDescription("Airlite alloy construction creates lightweight frame with power and durability.");
		products.add(product24);
		Product product25 = new Product();
		product25.setImage("image/product/tent.jpg");
		product25.setProductName("Tent");
		product25.setPrice(39.99);
		product25.setCategory("Sports & Outdoors");
		product25.setDescription("2-person camping dome tent waterproof portable tent with carry bag.");
		products.add(product25);
	}
	
	public static List<Product> getProducts() {
		if (products.isEmpty()) {
			initializeProducts();
		}
		return products;
	}
	
	public static Product getProductById(String id) {
	    for (Product product : getProducts()) {
	        if (product.getProductId().equalsIgnoreCase(id)) {
	        	System.out.println(product.getProductId());
	            return product;
	        }
	    }
	    return null; // Or throw an exception if you prefer
	}
	
	public static ArrayList<Product> getUserProductRecommendationByUsername(String username) {
		ArrayList<Product> productRecommendation = new ArrayList<>();
	    for (UserProfile userProfile : getUsersProfiles()) {
	        if (userProfile.getUserName().equals(username)) {
	        	for (Product product: getProducts()) {
	        		if(userProfile.getPreferredCategory().equals(product.getCategory())) {
	        			productRecommendation.add(product);
	        		}
	        	}
	        	
	         return productRecommendation;
	        }
	    }
	    return null; // Or throw an exception if you prefer
	}
	
	public static ArrayList<Product> getProductBySearch(String search) {
		ArrayList<Product> productSearch = new ArrayList<>();	
	    for (Product product: getProducts()) {
	    	String categoryName = product.getCategory().toLowerCase();
	    	if(categoryName.contains(search)) {
	    		productSearch.add(product);
	    	}   	   
	    }
	    return productSearch;
	}
	
	public static Cart getCartByUser(String username) {
		if(carts.get(username) == null) {
			carts.put(username, new Cart()); 
			System.out.println("carts1: " + carts.keySet());
		}
		return carts.get(username);
	}
	
	public static void deleteCartByUser(String username) {
		if(carts.get(username) != null) {
			carts.remove(username);
		}
	}
	
	public static void setOrders(Order order) {
		orders.add(order);
	}
	
	public static Order getOrderByUsername(String username) {
		for (Order order : orders) {
			if(order.getUserName().equals(username)) {
				return order;
			}
		}
		return null;
	}

	

}
