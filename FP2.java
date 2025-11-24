class ShoppingCard {
	private List<String> items = new ArrayList<>();

	public void addItem(String item) {
		items.add(item);
		if(item.equals("Книга")) {
		}
	}

	public int getDiscountPercentage() {
	if(bookAdded) {
		return 5;
	else 
		return 0;
	}

	public List<String> getItems() {
		return new ArrayList<>(items);
	}

	public void removeItem(String item) {
		items.remove(item);
		}
	}
}

ShoppingCard card = new ShoppingCard();
card.addItem("Флешка");
card.getDiscountPercentage()
card.addItem("Книга");
card.getitems().remove("Книга")
