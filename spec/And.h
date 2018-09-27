#ifndef __BINARY_AND__H__
#define __BINARY_AND__H__

#include <iostream>
#include "Prop.h"

class And : public BinaryOp{
 public:
  void print(std::ostream s);
  bool isAnd();
};
#endif
