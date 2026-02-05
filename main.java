
public class main {

	public static void main(String[] args) {
		System.out.println("running");
		//your test code here
		RedBlackTree tree=new RedBlackTree();
		tree.insert(5);
		tree.insert(6);
		tree.insert(4);
		tree.insert(3);
		tree.insert(2);
		tree.insert(7);
		tree.insert(1);
		tree.insert(9);
		tree.insert(10);
		tree.printTree();
		if(tree.isRedBlack()) System.out.println("true"); else System.out.println("false");
		System.out.println(tree.shortestTruePath());
		System.out.println(tree.trueHeightDiff());
	}
}
