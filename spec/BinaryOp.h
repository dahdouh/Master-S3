#ifndef __BINARY_OP__H
#define __BINARY_OP__H

#include <iostream>
#include "Prop.h"

class BinaryOp : public Prop{
 private:
  Prop* left;
  Prop* right;
 public:
  virtual void print(std::ostream s)=0;
  BinaryOp(Prop* l,Prop* r);
  bool isBinary();
};

#endif
