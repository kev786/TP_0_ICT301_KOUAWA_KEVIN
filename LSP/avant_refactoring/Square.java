package TP_0_ICT301_KOUAWA_KEVIN.LSP.avant_refactoring;

class Square extends Rectangle {
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}
