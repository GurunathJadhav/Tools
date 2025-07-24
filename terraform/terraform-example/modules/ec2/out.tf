output "public-ip" {
  value = aws_instance.ec2_instance.public_ip

}
output "private-ip" {
  value = aws_instance.ec2_instance.private_ip

}