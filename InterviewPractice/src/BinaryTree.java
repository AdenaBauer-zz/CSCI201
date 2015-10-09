

public class BinaryTree {

	Node root;
	
	public void addNode(String n, int k){
		Node newNode = new Node(n, k);
		
		if(root == null){
			root = newNode;
		}
		else{
			Node focusNode = root;
			Node parent;
			
			while(true){
				parent = focusNode;
				
				if(newNode.key < focusNode.key){
					focusNode = focusNode.leftChild;
							if(focusNode == null){
								parent.leftChild = newNode;
								return;
							}
				}
				else{
					focusNode = focusNode.rightChild;
					if(focusNode == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraversal(Node focusNode){ // nodes will get visited from smallest to largest value
		if(focusNode != null){
			inOrderTraversal(focusNode.leftChild);
			System.out.print(focusNode);
			inOrderTraversal(focusNode.rightChild);
		}
		
	}
	public void preOrderTraversal(Node focusNode){ 
		if(focusNode != null){
			System.out.print(focusNode);
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);
		}
		
	}
	public void postOrderTraversal(Node focusNode){ 
		if(focusNode != null){
			preOrderTraversal(focusNode.leftChild);
			preOrderTraversal(focusNode.rightChild);
			System.out.print(focusNode);

		}
		
	}
	
	
	

	public static void main(String [] args){
		
		
	}
}

class Node{
	String name;
	int key;
	
	Node leftChild;
	Node rightChild;
	
	Node(String s, int k){
		
		name = s;
		key = k;
	}
	
	public String toString(){
		return name + " has key of " + key;
	}
}

