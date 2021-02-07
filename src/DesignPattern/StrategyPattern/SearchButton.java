package DesignPattern.StrategyPattern;

public class SearchButton {
    private MyProgram myProgram;
    public SearchButton (MyProgram myProgram){
        this.myProgram = myProgram;
    }

    private  SearchStrategy searchStrategy = new SearchStrategyAll();

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }
    public void onClick(){
        searchStrategy.search();
    }

}
