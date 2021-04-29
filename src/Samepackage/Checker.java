package Samepackage;

import Otherpackage.*;

class SameClassChecker {
	public SameClassChecker() {
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	
	private void _private() {
		System.out.println("private");
	}
	
	void _default() {
		System.out.println("default");
	}
	
	protected void _protected() {
		System.out.println("protected");
	}
	public void _public() {
		System.out.println("public");
	}
	
}
	
class SamePackageChecker extends Same{
	public SamePackageChecker(){
		//���� ��Ű��
		Same same = new Same();
		same._public();
		same._protected();
		same._default();
		//same._private();
			
		//���� ��Ű�� ��� ����
		this._public();
		this._protected();
		this._default();
		//this._private();
			
	}
}
	
class OtherPackageChecker extends Other{
	public OtherPackageChecker() {
		//�ٸ� ��Ű��
		Other other = new Other();
		other._public();
		//other._protected();
		//other._default();
		//other._private();
		
		// �ٸ� Ŭ����, ����Ŭ����
		this._public();
		this._protected();
		//this._default();
		//this._private();
		
		//############�ۼ� ��##############
		Nothing nothing = new Nothing();
		nothing._public();
		//nothing._protected();
		//nothing._default();
		//nothing._private();
	}
	
}
