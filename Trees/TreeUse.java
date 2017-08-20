package Trees;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Stack;

import l15.QueueEmptyException;
import l15.QueueUsingLinkedList;


	class Pair<T, V> {
		T first;
		V second;
		
		public Pair(T first, V second) {
			this.first = first;
			this.second = second;
		}
		
	}


	public class TreeUse {

		// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
		// 8 2 3 4 6 1 5 -1 -1 -1 -1 -1 -1 -1 -1
		// 4 2 6 8 9 3 1 -1 -1 -1 -1 -1 -1 -1 -1
		// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
		public static TreeNode<Integer> takeTreeInputLevelWise() {
			System.out.println("Enter root data");
			Scanner s = new Scanner(System.in);
			int rootData = s.nextInt();
			if (rootData == -1) {
				return null;
			}

			TreeNode<Integer> root = new TreeNode<>(rootData);
			QueueUsingLinkedList<TreeNode<Integer>> queue = new QueueUsingLinkedList<>();
			queue.enqueue(root);
			while (!queue.isEmpty()) {
				TreeNode<Integer> parent;
				try {
					parent = queue.dequeue();
				} catch (QueueEmptyException e) {
					return null;
				}
				System.out.println("Enter left child of " + parent.data);
				int leftData = s.nextInt();
				if (leftData != -1) {
					TreeNode<Integer> leftChild = new TreeNode<Integer>(leftData);
					queue.enqueue(leftChild);
					parent.left = leftChild;
				}

				System.out.println("Enter right child of " + parent.data);
				int rightData = s.nextInt();
				if (rightData != -1) {
					TreeNode<Integer> rightChild = new TreeNode<Integer>(rightData);
					queue.enqueue(rightChild);
					parent.right = rightChild;
				}
			}
			return root;
		}

		public static int height(TreeNode<Integer> root) {
			if (root == null) {
				return 0;
			}
			return 1 + Math.max(height(root.left), height(root.right));
		}
		
		public static int height2(TreeNode<Integer> root){
			if(root == null)
				return 0;
			int lh=height(root.left);
			int rh=height(root.right);
			if(lh>rh)
				return lh+1;
			else
				return rh+1;
		}
		
		
		public static Pair<Integer, Boolean> heightAndBalanced(TreeNode<Integer> root) {
			if (root == null) {
				Pair<Integer, Boolean> output = new Pair<>(0, true);
				return output;
			}
			Pair<Integer, Boolean> leftOutput = heightAndBalanced(root.left);
			Pair<Integer, Boolean> rightOutput = heightAndBalanced(root.right);
			int height = 1 + Math.max(leftOutput.first, rightOutput.first);
			boolean isBalanced = 
					leftOutput.second && rightOutput.second 
					&& (Math.abs(leftOutput.first - rightOutput.first) <= 1);
			Pair<Integer, Boolean> output = new Pair<>(height, isBalanced);
			return output;
		}
		
		
		// 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1 
		public static TreeNode<Integer> takeTreeInput(Scanner s) {
			System.out.println("Enter root data");
			int rootData = s.nextInt();
			if (rootData == -1) {
				return null;
			}

			TreeNode<Integer> root = new TreeNode<>(rootData);
			root.left = takeTreeInput(s);
			root.right = takeTreeInput(s);
			return root;
		}

		public static void inorder(TreeNode<Integer> root) {
			if (root == null) {
				return;
			}
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
		
		public static void postorder(TreeNode<Integer> root) {
			if (root == null) {
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
		
		public static void preorder(TreeNode<Integer> root) {
			if (root == null) {
				return;
			}
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
		
		
		public static int sum(TreeNode<Integer> root) {
			if (root == null) {
				return 0;
			}
			return sum(root.left) + sum(root.right) + root.data;
		}
		
		public static int numberNodes(TreeNode<Integer> root) {
			if (root == null) {
				return 0;
			}
			return numberNodes(root.left) + numberNodes(root.right) + 1;
		}
		
		// 1 10 20 30 40 50 -1 -1 -1 -1 -1 -1 60 -1 -1
		public static ArrayList<Integer> retAncestors (TreeNode<Integer> root, int element){
			if(root == null){
				return null;
			}
			if(root.data == element){
				ArrayList<Integer> out= new ArrayList<Integer>();
				out.add(root.data);
				return out;
			}
			ArrayList<Integer> outleft = retAncestors(root.left, element);
			ArrayList<Integer> outright = retAncestors(root.right, element);
			if(outleft != null){
				outleft.add(root.data);
				return outleft;
			}
			if(outright != null){
				outright.add(root.data);
				return outright;
			}
			return null;
			
		}
		
		public static int maxNode(TreeNode<Integer> root){
			if(root == null){
				return Integer.MIN_VALUE;
			}
			int leftMax=maxNode(root.left);
			int rightMax=maxNode(root.right);
			int output;
			if(rightMax > leftMax)
			{
				output=rightMax;
				
			}
			else
				output= leftMax;
			if(root.data > output)
				return root.data;
			else
				return output;
		}
		
		public static int minNode(TreeNode<Integer> root){
			if(root == null){
				return Integer.MAX_VALUE;
			}
			int leftMax=minNode(root.left);
			int rightMax=minNode(root.right);
			int output;
			if(rightMax > leftMax)
			{
				output=leftMax;
				
			}
			else
				output= rightMax;
			if(root.data < output)
				return root.data;
			else
				return output;
		}
		
		//4 2 6 1 3 5 7 -1 -1 -1 -1 -1 -1 -1 -1
		public static boolean isBST(TreeNode<Integer> root){
			if(root == null)
				return true;
			//if(root.left.data < root.data && root.right.data >= root.data)
			//	return true;
			int leftmax=maxNode(root.left);
			int rightmin=minNode(root.right);
			if(root.data < rightmin || root.data > leftmax)
				return false;
			else if(root.data > rightmin || root.data > leftmax){
				if(root.left.data < root.data && root.right.data >= root.data)
					return true;
			}
			boolean isleft = isBST(root.left);
			boolean isright = isBST(root.right);
			return (isleft && isright);
		}
		
		public static TreeNode<Integer> buildBST(int input[], int si, int ei){
			if(si>ei){
				return null;
			}
			int mid=(si+ei)/2;
			TreeNode<Integer> ans=new TreeNode<Integer>(input[mid]);
			TreeNode<Integer> leftans = buildBST(input, si, mid-1);
			TreeNode<Integer> rightans = buildBST(input, mid+1, ei);
			ans.left=leftans;
			ans.right=rightans;
			return ans;
		}
		
		public static Triplet iSBST(TreeNode<Integer> root){
			if(root == null){
				Triplet t=new Triplet(true,Integer.MIN_VALUE,Integer.MAX_VALUE);
				return t;
			}
			Triplet leftans=iSBST(root.left);
			Triplet rightans=iSBST(root.right);
			int min=Math.min(leftans.min, Math.min(root.data, rightans.min));
			int max=Math.max(leftans.max, Math.min(root.data, rightans.max));
			boolean IsBst=root.data<=rightans.min && root.data>leftans.max && leftans.IsBst && rightans.IsBst;
			Triplet ans=new Triplet(IsBst,max,min);
			return ans;
		}
		
		public static void printAncestors(TreeNode<Integer> root,int element){ //maybe wrong
			if(root == null)
				return;
			if(root.data == element){
				System.out.println(root.data+",");
			}
			printAncestors(root.left, element);
			if(root.left.data != element){
				return;
			}
			printAncestors(root.right, element);	
		}
		
		//18 15 20 10 16 -1 24 5 12 -1 -1 -1 -1 3 -1 -1 -1 -1 -1
		public static int bstLCA(TreeNode<Integer> root, int e1, int e2){
			if(e1<root.data && e2>root.data){
				return root.data;
			}
			else if(e1>root.data && e2>root.data){
				int el=bstLCA(root.right, e1, e2);
				return el;
			}
			else if(e1<root.data && e2<root.data){
				int el=bstLCA(root.left, e1, e2);
				return el;
			}
			return -1;
		}
		
		
		public static BestBST largestsubBST(Trees.TreeNode<Integer> root){
			if(root == null){
				BestBST b=new BestBST(Integer.MAX_VALUE, Integer.MIN_VALUE, null, 0);
				return b;
			}
			BestBST leftans=largestsubBST(root.left);
			BestBST rightans=largestsubBST(root.right);
			int min=Math.min(root.data, Math.min(leftans.min, rightans.min));
			int max=Math.max(root.data, Math.max(leftans.max , rightans.max));
			
			if(root.data <= rightans.min && root.data > leftans.max && root.left == leftans.Tnode && root.right == rightans.Tnode){
				return new BestBST(min, max, root, 1+Math.max(leftans.height, rightans.height));
			}
			else{
				if(leftans.height > rightans.height){
					return new BestBST(min, max, leftans.Tnode, leftans.height);
				}
				else 
					return new BestBST(min, max, rightans.Tnode, rightans.height);
				}
		}
		
		public static int largestBSTSubtree(TreeNode<Integer> root) {
			if(root == null)
				return -1;
			return 0;
		}
		
		
		public static void printZigZag(TreeNode<Integer> root){
			if(root == null)
				return;
			Stack s1=new Stack();
			s1.push(root);
			boolean flag=false;
			while(!s1.isEmpty())
			{
				Stack s2 = new Stack();
				while(!s2.isEmpty()){
					TreeNode<Integer> temp=(TreeNode<Integer>) s1.pop();
					System.out.println(temp.data);
					if(!flag){
						if(temp.left!=null)
							s2.push(temp.left);
						if(temp.right!=null)
							s2.push(temp.right);
					}else
					{
						if(temp.right!=null)
							s2.push(temp.right);
						if(temp.left!=null)
							s2.push(temp.left);
					}
				}
				flag=!flag;
				s1=s2;
			}		
		}
		
		public static void printLevelWise(TreeNode<Integer> root){
			if(root == null)
				return;
			QueueUsingLinkedList<TreeNode<Integer>> primary=new QueueUsingLinkedList<>();
			QueueUsingLinkedList<TreeNode<Integer>> secondary=new QueueUsingLinkedList<>();
			primary.enqueue(root);
			while(!primary.isEmpty()){
				TreeNode<Integer> firstNode;
				try {
					firstNode=primary.dequeue();
				} catch (QueueEmptyException e) {
					return;
				}
				System.out.print(firstNode.data + " ");
				if(firstNode.left!=null){
					secondary.enqueue(firstNode.left);
				}
				if(firstNode.right!=null){
					secondary.enqueue(firstNode.right);
				}
				if(primary.isEmpty()){
					System.out.println();
					QueueUsingLinkedList<TreeNode<Integer>> temp=primary;
					primary=secondary;
					secondary=temp;
				}
			}
		}
		
		
		public static boolean find(TreeNode<Integer> root,int element){
			if(root == null)
				return false;
			if(root.data == element)
				return true;
			if(root.left==null && root.right == null ){
				if(root.data == element)
					return true;
				else
				return false;
			}
			 boolean l=find(root.left, element);
			 boolean r=find(root.right,element);
			return (l || r);
			
		}

		/*public static void spiralOrZigzagLevelOrder(TreeNode root) {
	        if(root==null) return; 
	        Stack stack=new Stack();
	        stack.push(root);
	        
	        boolean directionflag=false;
	        while(!stack.isEmpty())
	        {
	            Stack tempStack=new Stack();
	        
	            while(!stack.isEmpty())
	            {
	                TreeNode tempNode=(TreeNode) stack.pop();
	             System.out.printf("%d ",tempNode.data);
	                if(!directionflag) 
	                {
	                    if(tempNode.left!=null) 
	                     tempStack.push(tempNode.left);
	                    if(tempNode.right!=null) 
	                     tempStack.push(tempNode.right);
	                }else
	                {
	                    if(tempNode.right!=null) 
	                     tempStack.push(tempNode.right);
	                    if(tempNode.left!=null) 
	                     tempStack.push(tempNode.left);
	                }
	            }
	            // for changing direction
	            directionflag=!directionflag; 
	      
	            stack=tempStack; 
	        }
	     
	    }*/

		
		
		 public static void print(TreeNode<Integer> root) {
				if (root == null) {
					return;
				}
				System.out.print(root.data + ":");
				if (root.left != null) {
					System.out.print(root.left.data + ",");
				}
				if (root.right != null) {
					System.out.print(root.right.data + ",");
				}
				System.out.println();

				print(root.left);
				print(root.right);
			}
			
		 public static int leafNodes(TreeNode<Integer> root){
				if(root == null)
					return 0;
				if(root.left==null && root.right == null ){
					int c=1;
					return c;
				}
				int output=leafNodes(root.left)+leafNodes(root.right);
				return output;
			}	

		 public static void printNodesWithoutSibling(TreeNode<Integer> root) {
				if(root == null)
					return;
				if(root.left!=null && root.right!=null){
					printNodesWithoutSibling(root.left);
					printNodesWithoutSibling(root.right);
				}
				else if(root.right!=null){
					System.out.print(root.right.data + " ");
					printNodesWithoutSibling(root.right);
				}
				else if(root.left!=null){
					System.out.print(root.left.data + " ");
					printNodesWithoutSibling(root.left);
				}
			}

		 public static boolean checkBalanced(TreeNode<Integer> root){
			  if (root == null) {
					return true;
				}
				int lh = height2(root.left);
				int rh = height2(root.right);
				 if (Math.abs(lh - rh) <= 1 && checkBalanced(root.left) && checkBalanced(root.right))  {
			            return true;
				 }
			        return false;
			    }

		 public static int degree(TreeNode<Integer> root){
				if(root == null){
				return 0;
				}
				if(root.left!=null || root.right!=null)
					return 1;
				else if(root.left!=null && root.right!=null)
					return 2;
				return (degree(root.left) + degree(root.right));
				
			}
		 
		 public static void main(String[] args) {
			TreeNode<Integer> root = takeTreeInputLevelWise();
			//print(root);
			//Scanner s= new Scanner(System.in);
			/*int n=s.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=s.nextInt();*/
			//int element=s.nextInt();
			//System.out.println(retAncestors(root, element));
			//printAncestors(root, element);
			//System.out.println(minNode(root));
			//System.out.println(isBST(root));
			//Triplet ans=iSBST(root);
			//System.out.println(ans.IsBst);
			//TreeNode<Integer> root1=buildBST(a, 0, a.length-1);
			//print(root1);
			//int e1=s.nextInt();
			//int e2=s.nextInt();
			//System.out.println(bstLCA(root, e1, e2));
			//printLevelWise(root);
			BestBST ans=largestsubBST(root);
			//System.out.println(ans.height);
			//printZigZag(root);
			//spiralOrZigzagLevelOrder(root);
			//print(root);
			//System.out.println("max node is");
			//System.out.println(maxNode(root));
			/*Scanner s= new Scanner(System.in);
			int element=s.nextInt();
			System.out.println(find(root, element));*/
			//System.out.println(leafNodes(root));
			//System.out.println("degree node of the tree is:");
			//printNodesWithoutSibling(root);
			//System.out.print(checkBalanced(root));
			printLevelWise(root);
		}
		
}