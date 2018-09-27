#ifndef __UNARY__OP__NOT__H__
#define __UNARY__OP__NOT__H__

#include <iostream>
#include "Prop.h"

class Not : public Prop{
 private:
  Prop* p;
 public:
  Not(Prop* p);
  void print(std::ostream s);
  bool isNot();
};

#endif
