#ifndef __PROP__H__
#define __PROP__H__4

#include <ostream>

class Prop{
 public:
  //virtual bool eval()=0;
  virtual void print(std::ostream  s)=0;
  
  bool isAtomic();
  bool isBinary();
  bool isTrue();
  bool isFalse();
  bool isVar();
  bool isNot();
  bool isAnd();
  bool isOr();
  bool isImply();
  bool isEqual();
};

#endif
