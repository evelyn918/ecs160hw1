package edu.ucdavis.ecs160.hw1;

public class Evaluator implements ExprVisitor<Integer> {
    @Override
    public Integer visitNum(Num n) {
        return n.getValue();
    }

    @Override
    public Integer visitAdd(Add a) {
        return a.getLeft().accept(this) + a.getRight().accept(this);
    }

    @Override
    public Integer visitSub(Sub s) {
        return s.getLeft().accept(this) - s.getRight().accept(this);
    }

    @Override
    public Integer visitMult(Mult m) {
        return m.getLeft().accept(this) * m.getRight().accept(this);
    }

    @Override
    public Integer visitDiv(Div d) {
        return d.getLeft().accept(this) / d.getRight().accept(this);
    }
}