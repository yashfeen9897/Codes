package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTreeUse {

		public static int numNodes(GenericTreeNode<Integer> root) {
			if (root == null) {
				return 0;
			}
			
			int count = 1;
			for (int i = 0; i < root.children.size(); i++) {
				count += numNodes(root.children.get(i));
			}
			return count;
		}
		
		// 1 3 2 3 6 0 7 0 8 0 3 0 4 2 9 0 10 0
		public static GenericTreeNode<Integer> takeInput(Scanner s) {
			System.out.println("Enter root data");
			int rootData = s.nextInt();
			GenericTreeNode<Integer> root = new GenericTreeNode<>(rootData);
			System.out.println("Enter num children for " + rootData);
			int n = s.nextInt();
			for (int i = 0; i < n; i++) {
				GenericTreeNode<Integer> nextChild = takeInput(s);
				root.children.add(nextChild);
			}
			return root;
		}
		
		public static void print(GenericTreeNode<Integer> root) {
			System.out.print(root.data + ":");
			for (int i = 0; i < root.children.size(); i++) {
				System.out.print(root.children.get(i).data + ",");
			}
			System.out.println();
			for (int i = 0; i < root.children.size(); i++) {
				print(root.children.get(i));
			}
		}
		
		
		/*public static GenericTreeNode<Integer> findSecondLargest(GenericTreeNode<Integer> root){
			int max=root.data;
			for(int i=0;i<root.children.size();i++){
				GenericTreeNode<Integer> max1=findSecondLargest(root.children.get(i));
				
			}
		}*/
		
		public static boolean checkIfContainsX(GenericTreeNode<Integer> root, int x){
			boolean ans = false;
			if(root.data == x){
				ans = true;
			}
			for(int i=0;i<root.children.size();i++){
				 
				if(checkIfContainsX(root.children.get(i), x)){
					return true;
				}
			}
			return ans;
			
		}
		
		
		
		public static boolean checkIdentical(GenericTreeNode<Integer> root1, GenericTreeNode<Integer> root2){
			boolean ans=false;
			if(root1 == null && root2 == null){
				return true;
			}
			if(root1.data == root2.data){
				ans=true;
				return ans;
			}
			for(int i=0,j=0;i<root1.children.size() && j<root2.children.size(); i++,j++){
				if(checkIdentical(root1.children.get(i),  root2.children.get(i))){
					return true;
				}
				else
					return false;
			}
			return ans;
		}
		
		
		public static int numNodeGreater(GenericTreeNode<Integer> root,int x){
			if(root == null)
				return 0;
			int count=0;
			if(root.data > x){
				count++;
			}
			for(int i=0;i<root.children.size();i++){
			count+=numNodeGreater(root.children.get(i), x);
				}
			return count;
			}
		
		/*public static GenericTreeNode<Integer> maxSumNode(GenericTreeNode<Integer> root){
			if(root == null)
				return root;
			
		}*/
		
		
		public static int countLeafNodes(GenericTreeNode<Integer> root){
			int count = 0;
	        if(root==null)
	        {
	            return 0;
	        }
	        if(root.children.size()==0)
	        {
	            return 1;
	        }

	        for(int i = 0; i < root.children.size(); i++) 
	        {
	            count += countLeafNodes(root.children.get(i));
	        }

	        return count;
	    }
			
		
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			GenericTreeNode<Integer> root1 = takeInput(s);
			GenericTreeNode<Integer> root2 = takeInput(s);
			//print(root);
			//System.out.println(numNodes(root));
			//int x=s.nextInt();
			//System.out.println(checkIfContainsX(root, x));
			//System.out.println(numNodeGreater(root, x));
			//System.out.println(countLeafNodes(root));
			System.out.println(checkIdentical(root1, root2));
		}
	
}
