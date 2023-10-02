class MacFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

	@Override
	public Menu createMenu() {
		return new MacMenu();
	}
}