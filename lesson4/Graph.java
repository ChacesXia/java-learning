// ���һ����ϸ��Ϊ���Ρ������Ρ�Բ�κ���Բ�εġ�ͼ�Ρ������࣬ʹ�ü̳н���Щͼ�η��࣬����������󡣿������ɷ��ӣ�����Ҫ����ʵ��ϸ�ڣ���Ҫ�˽������ĵ�ʵ��˼�뷽����
//������
public abstract class Graph{
  private String graphName;
  public void setGraphName (String name) {
    this.graphName=name;
  }
  public String getGraphName () {
    return this.graphName;
  }
  public abstract float area ();
  public abstract float perimeter ();
}