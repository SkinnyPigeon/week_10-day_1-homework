public class Me {

  private String name;
  private Game[] collection;

  public Me( String name ){
    this.name = name;
    this.collection = new Game[ 5 ];
  }

  public String getName() {
    return this.name;
  }

  // public String showGames() {
  //   return Arrays.deepToString( this.collection );
  // }


  public int gameCount() {
    int count = 0;
    for( Game game : collection ) {
      if( game != null ) {
        count++;
      }
    }
    return count;
  }

  public void addGame( Game game ) {
    if( maxGames() ) return;
    int gameCount = gameCount();
    collection[ gameCount ] = game;
  }

  public boolean maxGames() {
    return gameCount() == this.collection.length;
  }

  public void sellAllGames() {
    for( int i = 0; i < this.collection.length; i++ ) {
      this.collection[ i ] = null;
    }
  }

  public void sellGame( Game game ) {
    for( int i = 0; i < this.collection.length; i++ ) {
      if( this.collection[ i ] == game ) {
        this.collection[ i ] = null;
      }
    } 
    // System.out.println( Arrays.toString( this.collection ) );
  }

}










