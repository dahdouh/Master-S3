#ifndef __BINARY__OR__H__
#define __BINARY__OR__H__

#include <iostream>
#include "BinaryOp.h"

class Or : BinaryOp{
 public:
  void print(std::ostream s);
  bool isOr();
};

#endif
