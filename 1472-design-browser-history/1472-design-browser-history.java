class BrowserHistory {
     Node curr;
    public BrowserHistory(String homepage) {
        Node node=new Node(homepage,null,null);
        curr=node;
       // Node last=node;
    }
    
    public void visit(String url) {
        
        curr.next=new Node(url,curr,null);
        curr=curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps!=0)
        {
            curr=curr.prev;
            steps--;
        }
        return curr.path;
    }
    
    public String forward(int steps) {
        while(curr.next!=null && steps!=0)
        {
            curr=curr.next;
            steps--;
        } 
        return curr.path;
    }
}
class Node{
    String path;
    Node prev;
    Node next;
    Node(String path,Node prev,Node next)
    {
        this.path=path;
        this.prev=prev;
        this.next=next;
    }
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */