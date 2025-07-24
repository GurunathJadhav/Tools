variable "intance_type" {
  description = "Instance Type"

}
variable "intance_name" {
  description = "Intance Name"

}

resource "aws_instance" "vm-1" {
  ami             = "ami-062f0cc54dbfd8ef1"
  instance_type   = var.intance_type
  key_name        = "devops_key_pair"
  security_groups = ["default"]

  tags = {
    Name = var.intance_name
  }

}
