package lucy.study.graphql;


import graphql.ExecutionResult;

public interface GraphUseCase {
    ExecutionResult execute(String query);
}
