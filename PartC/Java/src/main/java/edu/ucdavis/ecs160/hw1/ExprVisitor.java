package edu.ucdavis.ecs160.hw1;

public interface ExprVisitor<R> {
    R visitNum(Num n);
    R visitAdd(Add a);
    R visitSub(Sub s);
    R visitMult(Mult m);
    R visitDiv(Div d);
}